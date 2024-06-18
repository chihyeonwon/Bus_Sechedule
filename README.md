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
