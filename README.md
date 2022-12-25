# 치킨 이상형 월드컵
JAVA로 구현한 이상형 월드컵입니다.
# 개발 환경
Eclipse & Java
# 동작 원리
1.Java swing 을 이용해 jframe 으로 기본적인 골조를 생성후 이미지를 버튼화함.<br>
2.추상메서드를 생성하여 이미지 버튼을 클릭시 발생하는 액션 이벤트를 구현.
# 게임 방법
마음에 드는 이미지를 클릭하여 최종 적으로 선택한 사진이 중앙에 표시됩니다.
# 이슈
1.이미지 사이즈 변경이 되지않는 문제가 발생했었음.<br>
2.이미지 파일 경로 지정이 잘못되어 이미지 출력이 되지 않았었음.<br>
# 해결책
1.setSize 함수를 setPreferredSize 로 변경후 해결.
2.이미지 파일을 소스폴더가아닌 메인폴더로 이동후 절대경로 지정하니 해결.
# 추가하고 싶은 기능들
이미지 하단에 해당 이미지에 맞는 폰트를 추가하면 좋을 것 같음.
# 게임화면
![치킨월드컵](https://user-images.githubusercontent.com/117807117/209467709-cafc8afb-a6bc-4cb8-87ef-41ef9b9cac45.png)<br>
게임 실행 시 메인화면 출력.<br><br>
![치킨월드컵2](https://user-images.githubusercontent.com/117807117/209467751-67de4ef3-298d-4b23-96ae-b02194502cc0.png)<br>
이미지 클릭 시 클릭하지 않은 이미지 변경.<br><br>
![치킨월드컵3](https://user-images.githubusercontent.com/117807117/209467782-be09e977-8810-4b2e-bf94-699cb92889ec.png)<br>
마지막에 선택한 이미지가 중앙에 표시.<br>
# 참고영상
https://www.youtube.com/watch?v=V3ZEd_g_X94&list=PLrSOSlasEemV58V8gsCILnTkT92RXR9LZ&index=15
