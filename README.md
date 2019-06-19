# Subway 주문 어플
## 팀원: 강해량 김해인 명민지


![image1](https://user-images.githubusercontent.com/48266911/59332181-9e94a880-8d30-11e9-8d93-d9fe7192ef6c.PNG)
![image2](https://user-images.githubusercontent.com/48266911/59332189-a2282f80-8d30-11e9-941b-8b727a389476.PNG)




![BTN0SUBWAY](https://user-images.githubusercontent.com/48266911/59332006-4493e300-8d30-11e9-848c-4d0ab16d5c9f.gif)


### 최종 역할분담은 다음과 같이 했습니다<br>
###강해량: branchActivity , MenuActivity, BActivity, AddToppingActivity, AddMenuActivity (XML위주)<br>
###김해인:IntroActivity , MainActivity(+drawerLayout) , LoginActivity , (Intent로 모든 화면전환,ID값 전달)<br>
###명민지:CheeseActivity,VActivity, SActivity, SetMenuActivity, ResultActivity (최종 가격 계산)<br>

##동작과정(어플사용하는방법)<br>
###1.먼저 아이디와 패스워드를 입력해 로그인을합니다. \
###2. 아이디 정보를 확인 할 수 있습니다.
###3. 바로 주문을 원하시면, 바로주문하기 버튼을 누르세요.<br>
  ###3-1 만약 서브웨이 이벤트를 원하시거나,서브웨이먹는 방법을 알고싶으시다면 버튼을 눌러 정보를 확인하세요<br> 
  ###3-2 이때 로그아웃을 하고싶거나, 나의 정보를 확인하고싶으면 DrawerLayout을 사용하시면 됩니다.<br> 
 ###4 바로주문하기를 누르신다음, 원하는 지점을 선택하실 수 있습니다. 이때 편의를 위해 안양에 있는 서브웨이에 한에 선택할 수 있습니다. <br>
 ###5 메인 재료를 선택 할 수 있습니다. 원하는 메뉴의 라디오버튼을 누르고 '이미지 보기'버튼을 누를때마다 샌드위치의 사진을 볼 수 있습니다.<br>
 ###6 빵의 정보를 선택 할 수 있습니다. 빵의 종류, 굽기를 선택할 수 있습니다.  <br> 
 ###7 추가토핑은 체크박스로 여러개 추가할 수 있습니다.(이때, 가격이 각각 다르게 넘어갑니다.)<br> 
 ###8 치즈는 하나만 선택할 수 있습니다. <br> 
 ###9 채소는 기본으로 전체 선택이 되어있고, 먹기 싫은 채소를 제외해서 주문을 합니다.<br>(실제 서브웨이 매장에서 주문을 할때, '안드시는 채소 있으세요?로 질문을 합니다. ')<br>
 ###10 소스는 여러개 선택이 가능합니다.<br> 
  ###11 세트여부를 선택하는 화면입니다. 세트를 추가하시면 가격이 올라갑니다. <br>
 ###12 원하는추가메뉴를 선택할 수 있습니다. <br>
  ###13 마지막에 총 주문 금액이 나옵니다.<br>
 
 #요구사항 
 ##강해량 : 저는 xml위주로만 준비했습니다. 메인 메뉴를 선택할 때, OnClickListener에서 이미지가 바뀌는 기능을 만들었습니다.<br>
 ##김해인 : 저는 맨 처음 시작화면인 introActivity와 로그인 정보를 입력하는 LoginActivity, loginactivity 다음에 넘어가는 MainActivity를 했습니다. 또 각 Activity마다 버튼을 누르면 다음 Activity로 넘어가는 화면 intent작업을 했습니다.<br>
 ##명민지 : 저는 각 activity에서 주문한메뉴의 값을 계속 전달해 마지막 화면인 resultActivity에 주문한 메뉴의 금액을 다 더해서 출력하는 작업을 했습니다.
    
