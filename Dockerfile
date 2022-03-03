From openjdk:8
Expose 8095
Add target/ComplaintRedressalSystemV1-0.0.1-SNAPSHOT.war ComplaintRedressalSystemV1-0.0.1-SNAPSHOT.war
ENTRYPOINT  ["java","-jar","/ComplaintRedressalSystemV1-0.0.1-SNAPSHOT.war"]