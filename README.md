```
공개된 소스나 프로젝트라 하더라도 저작권은 소유자에게 있으니 라이선스 표시가 없을 경우 소유자에게 문의하시고 사용하셔야 합니다.
문의 : heungeob1003@gmail.com
```
모든 국민은 대중교통서비스를 제공받는데 있어 부당한 차별을 받지 아니하고, 편리하고 안전하게 대중교통을 이용할 권리를 가진다.    
모든 국민은 국가 및 지방자치단체의 대중교통정책에 협력하고 공공의 안전과 이익에 부합되도록 대중교통을 이용하여야 한다.    
```
앱의 핵심 기능 지도 위 버스 정류장 위치 표시, 버스 번호에 해당하는 버스의 노선을 지도에 표시하여 한눈에 볼 수 있게 한다.
도착 전 푸시 알림 설정 기능, 목적지를 설정하면 목적지 까지의 범위 반경 ~m 내에 버스가 가는 지에 대한 여부 판단
```
# Bus_Sechedule
Bus_Sechedule 앱 서비스는 자체 구축 및 운용이 어려운 중소도시 지자체의 버스 이용자 교통복지 증진을 위해        
공단에서 운영하고 있는 BIS통합센터 체계를 활용하여 이용자에게 정류소의 버스도착 정보, 차량내 행선지 안내 등의 서비스를 제공하는 앱입니다.    
정류장별 노선 리스트 불러오기, 노선별 정류장 리스트 불러오기, 정류장별 실시간 버스정보 불러오기, 버스별 실시간 정류장 위치 불러오기 등의 정보를 제공
Developer Won Chi Hyeon.

## 사용한 라이브러리
[Android Geofense](https://angangmoddi.tistory.com/266)

## MVVM 기반 아키텍처 설계

```
버스 번호를 검색하면 해당 버스의 노선 중 기점 과 종점 을 길찾기 API를 사용하여 이어서 지도에 경로를 표시한다.
지도에 목적지를 선택하고 선택한 목적지의 근방위로 경로가 지나가면 해당 목적지로 가는 버스로 분류한다.
```
-
## 법적근거
국가통합교통체계효율화법 제77조(교통체계지능화사업의 시행)   
국가통합교통체계효율화법 제78조(교통체계지능화사업 시행치침)    

## 데이터 상세
[국토교통부_전국 버스정류장 위치정보](https://www.data.go.kr/data/15067528/fileData.do)    
[국토교통부_(TAGO)_버스정류소정보](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15098534)      
[국토교통부_(TAGO)_버스노선정보](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15098529)     
[국토교통부_(TAGO)_버스도착정보](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15098530)     
[국토교통부_(TAGO)_버스위치정보](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15098533)

## 개발일지

### ViewPager2와 BottomNavigationView 연결
![2024-06-19 03;05;26](https://github.com/chihyeonwon/Wonju_Bus/assets/58906858/415a98d5-bee0-4e54-9182-c647f3efbac2)      
총 4개의 화면(fragment)으로 구성하였습니다.     
각 화면은 옆으로 넘겨서 이동이 가능합니다.     

북마크 화면 - 자주 타는 버스를 모아서 볼 수 있습니다.     
버스 화면 - 버스 번호를 검색하여 해당 버스의 실시간 위치를 볼 수 있습니다.    
정류장 화면 - 정류장을 검색하여 해당 정류장의 버스 목록을 볼 수 있습니다.    
길찾기 화면 - 주변의 정류장의 위치를 지도에 보여주고 버스번호를 입력하면 버스의 노선을 지도에 표시합니다.     
목적지를 등록하면 목적지 근방까지 해당 버스가 가는 지의 여부를 판단하여 화면에 보여줍니다.    

### 도시 이름, 코드로 서버에서 버스 노선 데이터 받아오
![2024-06-19 20;36;35](https://github.com/chihyeonwon/Wonju_Bus/assets/58906858/2a78c903-fd7f-4e49-b1cb-25801708e18d)

```
<< 개발 목표 설계 >>

노선별 현재 버스 위치를 버스위치 정보 공공데이터에서 받은 다음
버스노선 정보 공공데이터에서 버스번호에 해당하는 노선 리스트를 화면에 뿌린다음
만약 현재 버스 위치 이름과 노선 리스트에 위치하는 아이템의 이름이 같으면 레이아웃의 색깔을 빨갛게 한다.

api 설명에 여러 api를 복합적으로 사용해서 하나의 앱을 만든다

버스노선 정보 공공데이터에서 노선ID 값을 받아온다.

실시간 위치를 갱신 10~20초 주고 갱신
사용자가 원할 때 갱신할 수 있도록 버튼에 갱신
-> 비동기 처리
```



