# TODO LIST - REST API

Welcome! This project actually is made for learning bloc state management on flutter because i want to practice using rest api.

## Service

- **Create Task**
- **Update Task**
- **Get All Task**
- **Get Task Detail**
- **Delete Task**
  
## How To Start

### Prerequisites

1. [Java](https://www.oracle.com/java) (v17 or later)
2. [Maven](https://maven.apache.org/download.cgi)
3. An Database (I use [Laragon](https://laragon.org/download/index.html) for my local database server)

### Installation

1. Clone this repository
   ```sh
   git clone https://github.com/rezaageng/me.git
   ```
2. Install dependencies
   ```sh
   mvn install
   ```
3. Copy `application-test.properties` to `application.properties` and fill in the values
   ```sh
   cd src/main/resources
   cp application-test.properties application.properties
   ```
4. Run the development server
   ```sh
   mvn spring-boot:run
   ```

### Build

```sh
mvn clean install
java -jar todolist-api-0.0.1-SNAPSHOT.jar
```

## Feedback and Support

Have feedback or need support? Please reach me out at [lutfhikemall@gmail.com](mailto:lutfhikemall@gmail.com).

## Support Me ☕

If you find MyGithubUser helpful or just want to support my work, you can buy me a coffee! ☕

<a href="https://www.buymeacoffee.com/lutfhikemall" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>