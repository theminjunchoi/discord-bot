# 1단계: Gradle로 jar 빌드
FROM gradle:8.4.0-jdk17 AS builder

WORKDIR /app
COPY . .
RUN gradle shadowJar

# 2단계: 빌드된 jar만 복사해서 실행
FROM eclipse-temurin:17-jdk

WORKDIR /app
COPY --from=builder /app/build/libs/bot.jar app.jar

CMD ["java", "-jar", "app.jar"]
