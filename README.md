<h3 align="center">QACinema Website</h3>

---

<p align="center">A custom made website created for QACinema. Including frontend and backend connections.
    <br> 
</p>

## 🎈 Usage

1. Clone the repo
   ```sh
   git clone https://github.com/RGlossop/QACinemas.git
   ```

## 🚀 Deployment
    
1.  Setup a PayPal developer account to get a personal authentication key 
2.  Insert key into PaymentController, line 21, replaveing "UwU"
3.  Setup a MySql Server
4.  Add the server url link, username and password to the fields provided in application.conf
5.  Run the following command to compile the project
    ```sh
    sbt dist
    ```
6.  Navigate to /target/universal
7.  Extract the zip file
8.  Navigate to /"zipfilename"/bin
9.  Run the .bat file
    
## ⛏️ Testing

1. To run all the tests with coverage, execute the following commnad
   ```sh
   sbt clean coverage test
   ```
   
2. To show the test coverage on a website, run the following command
   ```sh
   sbt coverageReport
   ```
   
3. To access the report, after the website is compiled, navigate to the output directory
   ```sh
   target/scala-2.13/scoverage-report/index.html
   ```
   
## ⛏️ Selenium Testing
    1. To run all the tests ensure the chrome driver in test/resources matches your version of chrome, then right click selenium/tests/ folder and run all tests in tests
## ⛏️ Built Using
- [HTML](https://html.spec.whatwg.org/) - Front end
- [CSS](https://www.w3.org/TR/CSS/#css) - Styling
- [Bootstrap](https://getbootstrap.com/) - Styling/Functionality
- [Scala](https://scala-lang.org/) - Backend
- [MySQL](https://www.mysql.com/) - Database
- [ScalaTest](https://www.scalatest.org/) - Testing
- [Mockito](https://site.mockito.org/) - Testing
- [Selenium](https://www.browserstack.com/selenium) - Testing
- [Java](https://www.java.com/en/) - Backend Testing With Selenium

## ✍️ Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## ✍️ Authors
- [@Luk14](https://github.com/Luk14) - Developer
- [@LLow-QA](https://github.com/LLow-QA) - Developer
- [@RGlossop](https://github.com/RGlossop) - Developer
- [@khanahoe-qa](https://github.com/khanahoe-qa) - Developer

## 📝 License
This project is licensed under the MIT License - see the LICENSE.md file for details
