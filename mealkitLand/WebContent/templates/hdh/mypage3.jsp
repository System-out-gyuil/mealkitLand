<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>배송 조회</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/hdh/mypage3.css">
    <style>
    	.tbl{
    		    text-align: center;
    	}
    </style>
</head>
<body>
    <div class="wrap" style>
    <%@include file = "/templates/kgm/header.jsp" %>
    <section id="contents" class="container">
        <div class="content-wrap frame-sm-mypage">
            <div class="frame-sm">
                <div class="frame-left">
                    <div class="aside-menu-wrap">
                        <nav class="aside-menu">
                            <ul class="menu-list">
                                <li>
                                    <a class="menu">내 정보관리</a>
                                    <ul class="depth2">
                                        <li>
                                            <a>회원정보 수정</a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a class="menu">메뉴</a>
                                    <ul class="depth2">
                                        <li class>
                                          <a href="${pageContext.request.contextPath}/subscribeOk.subscribe">나의 구독내역</a>
                                        </li>
                                        <li class>
                                            <a href="${pageContext.request.contextPath}/deliveryOk.delivery">배송조회</a>
                                        </li>
                                        <li class>
                                        </li>
                                        <li class>
                                           <a href="${pageContext.request.contextPath}/cartOk.cart">장바구니</a>
                                        </li>
                                        <li class>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="frame-right">
                    <div class="frame-cnt-inner">
                        <div class="menu-title-area">
                            <h3 class="title-menu">배송 조회</h3>
                        </div>
                        <div class="board-list" id="tbl-my-delivery">
                            <table class="tbl">
                                <caption>배송 조회</caption>
                        
                                <thead>
                                    <tr>
                                        <th scope="col">받으실 분</th>
                                        <th scope="col">배송주소</th>
                                        <th scope="col">상품명</th>
                                        <th scope="col">연락처</th>
                                    </tr>
                                </thead>
                                <tbody class="tbody">
                           
                                </tbody>
                            </table>
                        </div>
                        <div class="btn-bottom-area">
                            <button type="button" class="btn-basic-lg2 btn-navy btn-basic-delivery" id="btn">
                                배송조회
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <%@include file = "/templates/kgm/footer.jsp" %>
    </div>
</body>
</html>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script>

let jsonAr = '${jsonAr}'; // JSON 문자열을 포함하는 변수 선언
let result = JSON.parse(jsonAr);
console.log(result);


const btn = document.querySelector("#btn");
const tbl = document.querySelector(".tbl");
const tbody = document.querySelector(".tbody");
let text ="";


result.forEach((item) => {
console.log(${item.productName});
 text += "<tr> <td>"+item.userName+"</td><td>"+item.deliveryAddress+"</td> <td>"+item.productName+"</td> <td>"+item.userPhone+"</td> </tr>"; 
 

});   

console.log(text);
console.log(btn);

btn.addEventListener("click",()=>{
	tbody.innerHTML = text;
   
});


</script>