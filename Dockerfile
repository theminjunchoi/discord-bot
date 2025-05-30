# 1. Java 17 JDK 기반 이미지
FROM eclipse-temurin:17-jdk

# 2. 작업 디렉토리 지정 (이 안에서 jar 실행됨)
WORKDIR /app

# 3. jar 파일 복사
COPY build/libs/bot.jar app.jar

# 4. jar 실행 커맨드
CMD ["java", "-jar", "app.jar"]
