<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>MyPage</title>
  <script
  src="https://kit.fontawesome.com/68dda164c0.js"
  crossorigin="anonymous"></script>
</head>
<style>
  body{
    margin: 15px;
    width: 1280px;
    height: 1024px;
    border: 1px solid;
  }
  header img{
    float: right;
    margin-right: 0px;
    width: 70%;
    height: 150px;
  }
  header a{
    color: midnightblue;
    text-decoration: none;
    font-size: 40px;
  }
  header span{
    /* background-color: lightskyblue; */
    display: inline-block;
    margin-top: 40px;
  }
  header{
    text-align: center;
    padding-left:30px ;
    /* padding-top: 30px; */
    width: 100%;
    height: 150px;
    border: 1px solid;
    box-sizing: border-box;
    background-color: wheat;
  }
  nav table{
    
    float: right;
    margin-right: 20px;
    margin-top: 10px;
  }
  nav{
    background-color:rgba(101, 226, 43, 0.507);
    width: 100%;
    height: 50px;
    border: 1px solid;
    float: left;
  }
  #menu{
    font-size: 20px;
    margin-left:20px ;
    list-style-type: none;
    margin: 0;
    padding: 0;
    position: relative;
    
  }
  #menu li a{
    float: left;
    color: black;
    text-align: center;
    padding: 16px;
    text-decoration: none;
  }
  #menu li a:hover{
    background-color: rgba(0, 0, 0, 0.418);
  }

 
  aside{
    margin: 5px;
    float: left;
    width: 300px;
    height: 750px;
    background-color: rgba(211, 126, 168, 0.342);
    border: 1px solid;
  }
  section{
    margin: 5px;
    float: left;
    width: 950px;
    height: 750px;
    border: 1px solid;
  }
  
    section #content{
 	font-size: 30px
  }
  #photo img{
    width: 200px;
    height: 200px;
    margin-top: 80px;
    margin-left: 50px;
    border: 1px solid;
    border-radius: 30%;
  }
  aside ul{
    list-style-type: none;
  }
 
  aside table{
    margin-left: 50px;
  }
  aside li{
    font-size: 20px;
  }
  section{
    background-color: gray;
  }
  section #main{
    background-color: white;
    margin-left: 20px;
    margin-top: 20px;
    width: 900px;
    height: 680px;
    border: 1px solid;
    box-sizing: border-box;
  }
  section #main td{
    border: 1px solid;
    box-sizing: border-box;
    text-align: center;
  }
 
  section #main a{
    color: #00000034;
    text-decoration: none;
    font-size: 50px;
  }
  section #num{
    display: inline-block;
    margin-left:180px ;
    padding-left: 50px;
    width: 200px;
    height: 30px;
    /* border: 1px solid; */
  }
  section #button{
    display: inline-block;
    margin-left: 20px;
    margin-top: 5px;
    width: 150px;
    height: 30px;
    /* border: 1px solid; */
  }
  section #search{
    float: right;
    margin-top: 5px;
    margin-left: 20px;
    width: 300px;
    height: 50px;
    /* border: 1px solid; */
  }
footer{
  background-color: rgba(0, 0, 0, 0.719);
  /* margin: 5px; */
  float: left;
  width: 1280px;
  height: 60px;
  color: white;
  /* border: 1px solid; */
  text-align: center;
}
</style>
<body>
  <header>
    <img src="https://gongu.copyright.or.kr/gongu/wrt/cmmn/wrtFileImageView.do?wrtSn=11288734
    &filePath=L2Rpc2sxL25ld2RhdGEvMjAxNS8wMi9DTFM2OS9OVVJJXzAwMV8wMjIwX251cmltZWRpYV8yMDE1MTIwMw==&thumbAt=Y&thumbSe=b_tbumb&wrtTy=10006" alt="">
    <span><a href="#"><i class="fa-solid fa-layer-group">   코딩 공부</a></i></span>
      
    
  </header>
  <nav>
    <div>
      <ul id="menu">
        <li><a href="#header"><i class="fa-solid fa-house"></i>HOME</a></li>
        <li><a href=""><i class="fa-solid fa-pencil"></i>STUDY</a>
        <li><a href="#"><i class="fa-solid fa-keyboard"></i>CODE</a></li>
        <li><a href="#"><i class="fa-solid fa-file-powerpoint"></i>PROJECT</a></li>
        <li><a href="question"><i class="fa-solid fa-file-powerpoint"></i>QnA</a></li>
      </ul>
    </div>
    <form action="">
      <table>
        <tr>
          <td><label for="">ID</label></td>
          <td><input type="text" size="10" placeholder="아이디" required></td>
          <td><label for="" >PW</label></td>
          <td><input type="password" size="10" placeholder="비밀번호" required></td>
          <td><button>로그인</button></td>
          <td><button>회원가입</button></td>
        </tr>
      </table>
    </form>
  </nav>
  <aside>
    <div id="photo">
      <img src="https://picsum.photos/200/200" >
    </div>
    <ul>
      <li><i class="fa-solid fa-envelope"></i><span> </span>stk131@naver.com</li>
      <li>
        <a href="https://github.com/Taekyun131">
         <i class="fa-brands fa-github"></i>
        </a> github.com/Taekyun131
      </li>
    </ul>
    <form action="">
      <table>
        <tr>
          <td><button>정보수정</button></td>
          <td><button>로그아웃</button></td>
        </tr>
      </table>
    </form>
  </aside>
  <section>
  	<form action="save" method="post">
	    <table id="main">
		   	<tr>
		   		<td><label for="subject">과목선택</label></td>
		   		<td>
		   			<select id=subject name="sub">
		   				<option value="html">html</option>
		   				<option value="js">js</option>
		   				<option value="java">java</option>
		   				<option value="oracle">oracle</option>
		   				<option value="spring">spring</option>
		   			</select>
	   			</td>
	   			<td>
	   				<label for="title">제목</label>
	   			</td>
	   			<td>
	   				<input id="title" type="text"></input>
	   			</td>
		   	</tr>
		   	<tr>
		   		<td>
		   			<label>내용</label>
		   		</td>
		   	</tr>
		   	<tr>
		   		<td colspan=4>
		   			<textarea id=content rows="5" cols="30"></textarea>
		   		</td>
		   	</tr>
		   	<tr>
		   		<td>
		   			<button type="submit"  >저장</button>
		   		</td>
		   	</tr>
	    </table>
  	</form>
    <table id="button">
      <tr>
        <td><button href="write">글 작성</button></td>
        <td><button>글 삭제</button></td>
      </tr>
    </table>
    <div id="num">
      <span><a href=""><i class="fa-solid fa-angles-left"></i></a></span>
      <span><a href=""><i class="fa-solid fa-angle-left"></i></a></span>
      <span>1   2   3   4   5</span>
      <span><a href=""><i class="fa-solid fa-angle-right"></i></a></span>
      <span><a href=""><i class="fa-solid fa-angles-right"></i></a></span>
    </div>
    <div id="search">
      <form action="" method="" id="search">
        <select>
          <option value="1"><선택></option>
          <option value="2">글 내용</option>
          <option value="3">작성자</option>
          <option value="4">전체</option>
        </select>
        <input type="text" size="20" placeholder="검색어를 입력하세요" required >
        <button type="submit" >검색</button>
      </form>
    </div>
  </section>
  <footer><h4>Copyright 2024 Human.Inc all rights reserved.</h4></footer>
</body>
</html>

