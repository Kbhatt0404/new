mvn clean compile quarkus:dev
-------------------------------
mvn clean package quarkus:dev
-----------------------------
**********************************
ISSUES 
both the tables working seperately but i am not able to connect output requestIdList to input requestId.


below are results.


input
-------------------
curl -d '{"changeRequest":{"changeType":"NAME" }}' -H "Content-Type: application/json" -X POST http://localhost:8080/change
---------------------
output
--------------------
[{"docIdList":null,"reasonDescription":null,"requestIdList":[1,2]}]



input
----------------
curl -d '{"changeRequest":{"changeType":"NAME","reasonId":2 }}' -H "Content-Type: application/json" -X POST http://localhost:8080/change
------------
output
--------------
[{"docIdList":[1,2,3],"reasonDescription":"GOT_MARRIED_AND_NAME_CHANGED","requestIdList":[1,2]}]
