package www.silver.util;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller //객체생성과 컨트롤러역할을 하기위해 @Controller사용
//servlet-context에 scan 설정해야 인식
public class FileDataUtil {
	
	private ArrayList<String> extNameArray = new ArrayList<String>() // 허용하는 확장자 정의를 한 것.
	{
		{
			add("gif");
			add("jpg");
			add("png");
		}
	};     //<-- 현재 코드는 활용하지는 않는다.. 얘는 선언이지 기능이 동작하지는 않는다. 절대 미리 예측 금지..
	
	//첨부파일 업로드 경로 변수값으로 가져옴 servlet-context.xml
	@Resource(name="uploadPath")//컨테이너에서 객체주소주입 어노테이션...name>>이름으로 주소주입
	private String uploadPath;// uploadPath가 의미하는 것은 파일의 경로지정
	
	//private String uploadPath="/temp" 쓰지 않는 이유: spring은 java소스는 건들지 않고 환경설정만 조작
												//>>환경설정을 통해 어떤 흐름인지 파악
												//>>개발주체가 개발자가 아닌 spring(Inversion Of Control-제어의 역전)
	
	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	/**
	 * 게시물 상세보기에서 첨부파일 다운로드 메서드 구현(공통)
	 */
	@RequestMapping(value="/download", method=RequestMethod.GET)
	@ResponseBody   // 어떤 데이터를 포함하여 전송.. 어노테이션.. view지정하지 않고 바로 클라이언트 요청으로 응답.
	public FileSystemResource fileDownload(@RequestParam("filename") String fileName, HttpServletResponse response) {
		File file = new File(uploadPath + "/" + fileName);
		response.setContentType("application/download; utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
		return new FileSystemResource(file);
	}
	
	/**
	 * 파일 업로드 메서드(공통)
	 * @throws IOException 
	 */
	public String[] fileUpload(MultipartFile[] file) throws IOException {
		String[] files = new String[file.length];
		for(int i=0; i < file.length; i++) {
			if(file[i].getOriginalFilename()!="") {  // 실제 file객체가 존재한다면
				String originalName = file[i].getOriginalFilename();//확장자가져오기 위해서 전체파일명을 가져옴.
				UUID uid = UUID.randomUUID();//랜덤문자 구하기 맘에안든다. 
				String saveName = uid.toString() + "." + originalName.split("\\.")[1];//한글 파일명 처리 때문에...
				// 
//			String[] files = new String[] {saveName}; //형변환  files[0] 파일명이 들어 간다..
				byte[] fileData = file[i].getBytes(); //첨부파일 binary파일로 
				
				File target = new File(uploadPath, saveName);//저장할 위치
				FileCopyUtils.copy(fileData, target);//저장위치에 copy
				files[i]=saveName;//배열에 랜덤이름 저장
			}			
		}		
		return files;
	}

	public ArrayList<String> getExtNameArray() {
		return extNameArray;
	}

	public void setExtNameArray(ArrayList<String> extNameArray) {
		this.extNameArray = extNameArray;
	}
}


