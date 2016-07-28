# web applicaton sesstion state caching with redis sample

brew install redis

/usr/local/bin/redis-server 

mvn clean

mvn spring-boot:run

http://localhost:8080

put user/password

$ redis-cli keys '*'

$ redis-cli keys '*' | xargs redis-cli del

restart tomcat

http://localhos:8080

see if session is kept(no login required) 

http://docs.spring.io/spring-session/docs/current/reference/html5/guides/boot.html



