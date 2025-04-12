# 1. 베이스 이미지 설정 (Java 17)
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 생성
WORKDIR /app

# 3. JAR 파일 복사 (build/libs/ 디렉토리 기준)
COPY build/libs/*.jar app.jar

# 4. 컨테이너 포트 노출
EXPOSE 8080

# 5. JAR 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
