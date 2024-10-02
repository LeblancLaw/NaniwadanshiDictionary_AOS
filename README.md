# なにわ男子 백과
  
## 🩶 1. 개요
**나니와단시 백과사전**은 일본의 인기 아이돌 그룹 나니와단시의 각 멤버에 대한 포괄적인 정보를 제공하는 안드로이드 애플리케이션입니다.

이 앱은 그룹 및 각 멤버에 대한 상세한 정보, 최신 사진 등을 제공합니다.

## ⏰ 2. 개발 기간
- 24년 6월 3일 ~ 24년 6월 16일 (1인 프로젝트)

## 🛠️ 3. 개발 환경
#### 1. **프로그래밍 언어**
   - **Kotlin**

#### 2. **빌드 시스템**
   - **Gradle**: 이 프로젝트는 Gradle을 빌드 시스템으로 사용하며, Kotlin DSL(`build.gradle.kts`)을 사용합니다.
   - **Gradle Wrapper**: 프로젝트에 Gradle Wrapper(`gradlew`, `gradlew.bat`)가 포함되어 있어 일관된 Gradle 버전을 사용할 수 있습니다.

#### 3. **Android SDK 및 최소 요구 사항**
   - **Android SDK**: 이 프로젝트는 **Android API Level 30** (Android 11.0) 이상을 필요로 합니다.
   - **최소 지원 Android 버전**: **API Level 21** (Android 5.0) 이상의 Android 기기에서 실행 가능합니다.

#### 4. **통합 개발 환경 (IDE)**
   - **Android Studio**: 권장되는 통합 개발 환경(IDE)은 Android Studio입니다.
     - **버전**: **Android Studio Arctic Fox (2020.3.1)** 또는 이후 버전을 사용했습니다.
   
#### 5. **Gradle 플러그인**
   - 다음 Gradle 플러그인이 사용됩니다:
     - `com.android.application`: Android 애플리케이션을 빌드하기 위한 플러그인.
     - `org.jetbrains.kotlin.android`: Android에서 Kotlin을 지원하기 위한 플러그인.

#### 6. **Java 호환성**
   - 이 프로젝트는 **Java 11**과 호환됩니다.

## 의존성

이 프로젝트는 여러 AndroidX 라이브러리 및 표준 의존성을 사용하며, Gradle을 통해 관리됩니다. 주요 의존성은 다음과 같습니다:

- **AndroidX 라이브러리**:
  - `androidx.core:core-ktx`
  - `androidx.appcompat:appcompat`
  - `androidx.constraintlayout:constraintlayout`

- **Kotlin**:
  - `org.jetbrains.kotlin:kotlin-stdlib`

자세한 의존성 목록은 다음 파일에서 확인할 수 있습니다:
- 프로젝트 루트 디렉토리의 `build.gradle.kts` 파일 (프로젝트 전반의 설정).
- `app/build.gradle.kts` 파일 (앱의 의존성 설정).



## 👾 4. 주요 기능
- **멤버 프로필**: 각 멤버의 생애, 별명, 개인적인 정보 등을 담은 상세한 프로필을 제공합니다.
- **뉴스 업데이트**: 나니와단시와 관련된 최신 뉴스와 이벤트 정보를 빠르게 확인할 수 있도록 그룹의 SNS로 이동할 수 있는 버튼을 제공합니다.
- **이미지 갤러리**: 그룹의 고화질 이미지를 탐색할 수 있는 갤러리가 포함되어 있습니다.
<details>
  <summary>SQLite를 사용하여 다양한 데이터를 관리 및 저장합니다. 즐겨찾기와 개인화 설정 등 사용자 관련 정보는 로컬 데이터베이스에 안전하게 저장됩니다.
</summary>
  <img width="770" alt="스크린샷 2024-06-17 오전 12 47 54" src="https://github.com/user-attachments/assets/37207c74-8f50-43f0-8e4b-6da009df004a">
  <img width="784" alt="스크린샷 2024-06-17 오전 12 47 02" src="https://github.com/user-attachments/assets/bec4fed7-bae3-44df-a51c-b6cfebd55f7b">
</details>

<details>
  <summary> 상세 페이지 UI </summary>

!<img width="281" alt="스크린샷 2024-06-17 오전 12 56 57" src="https://github.com/user-attachments/assets/0712679d-0de5-478a-8393-98d052eed23c"> <img width="281" alt="스크린샷 2024-06-17 오전 12 56 00" src="https://github.com/user-attachments/assets/be8c0ca2-96ce-4721-954c-4231e7b01d5e">

  ![003](https://github.com/user-attachments/assets/4a18534b-b580-439d-b07f-14e18430d4b3)
  ![004](https://github.com/user-attachments/assets/584152ce-2864-4d46-942c-7334f7f84892)
  ![005](https://github.com/user-attachments/assets/9bafe8d6-66ae-46cf-a638-5c6e54147244)
  ![006](https://github.com/user-attachments/assets/e9d649f0-14eb-4720-a51b-60065c1805fd)
  ![007](https://github.com/user-attachments/assets/72997e8a-54b1-47cf-9ad8-9f26dc009d85)

</details>


## ⚙️ 5. 설치 및 실행 방법

#### 1. 사전 요구 사항
- **Android Studio**: 최신 버전의 [Android Studio](https://developer.android.com/studio)를 설치하세요.
- **JDK**: 최소 Java Development Kit (JDK) 8 이상이 필요합니다.
- **Gradle**: 프로젝트에 포함된 Gradle Wrapper를 사용하거나, 시스템에 Gradle을 설치할 수 있습니다.

#### 2. 프로젝트 클론
다음 명령어를 사용하여 리포지토리를 클론합니다:
  ```bash
git clone https://github.com/theendofthefuxxingworld/mobileProgramming.git
 ```

## 📝 6. 추가 문서
- [기능 데모 영상](https://youtu.be/d8nnTardZe4)
