SwagLabs Automation Testing Project 🎉🚀
Overview 🌟
This project is an exciting journey into developing and executing automation testing scripts for the Swag Labs website (https://www.saucedemo.com/) as a hands-on training exercise in automation testing. 🌐 We utilize Selenium WebDriver with TestNG to structure and run our tests, and Allure for generating detailed, colorful test reports that make analyzing results a breeze! 📊 The goal is to validate various functionalities of the Swag Labs e-commerce platform, including login, product browsing, cart management, and checkout processes. 🛒 Whether you're a beginner or an experienced tester, this project offers a fun way to sharpen your automation skills! 😄
Project Objectives 🎯

Automate end-to-end testing of the Swag Labs website with precision and efficiency. ✅
Validate key features like product listing, cart functionality, and smooth navigation across pages. 🔍
Generate detailed test reports using Allure to track progress and identify issues effortlessly. 📈
Learn and apply automation testing best practices using Selenium, TestNG, and Allure, building a strong foundation for future projects. 📚
Encourage collaboration and continuous improvement by documenting challenges and solutions. 🤝

Prerequisites 🛠️
Before diving into the project setup, ensure the following tools and configurations are ready on your machine:

Operating System: Windows 10 💻
Java Development Kit (JDK): Version 24
Verify with: java -version and ensure it matches the expected output. ✅


Git: Version 2.45.1.windows.1
Verify with: git --version to confirm the installation. 🕒


Node.js: Version 21.5.0
Verify with: node --version to check the runtime environment. 🌐


npm: Version 10.8.2
Verify with: npm --version to ensure package management is set up. 📦


Maven: Required for dependency management (usually bundled with IDEs like IntelliJ IDEA). Install it manually if needed from Maven Official Site. 🔧
IDE: IntelliJ IDEA or Eclipse (recommended for a smooth coding experience). 🖥️
Web Browser: Chrome (automatically managed by WebDriverManager for test execution). 🌐

Project Setup 🏗️
Let’s get your environment ready to roll! Follow these steps to set up the project:
1. Clone the Repository 🌐
Clone the project repository from GitHub with a single command:
git clone https://github.com/Hattabvic/DEPI-Graduate-Project-.git
cd DEPI-Graduate-Project-

Make sure you’re connected to the internet, and watch the magic happen as Git pulls the code! ✨
2. Install Dependencies 📥
The project relies on Maven for dependency management. Navigate to the project directory and run:
mvn clean install

This command downloads all dependencies listed in pom.xml, including:

Selenium Java (4.31.0) for browser automation. 🕸️
Selenium Manager (4.31.0) for driver management. 🚗
WebDriverManager (5.7.0) to handle browser drivers effortlessly. 🔧
TestNG (7.7.1) for test structuring and execution. ✅
SLF4J (2.0.7) and Logback (1.4.8) for logging test outputs. 📝Sit back and let Maven do the heavy lifting! ⏳

3. Install Allure Commandline 🎨
Allure brings your test results to life with stunning reports! Install Allure Commandline via npm:
npm install -g allure-commandline@2.29.0

Add the Allure binary to your PATH for easy access:

On Windows, add C:\Users\<YourUsername>\AppData\Roaming\npm to the PATH in Environment Variables. 🔧Verify the installation with a cheerful command:

allure --version

Expected output: 2.29.0 – time to celebrate a successful setup! 🎉
4. Configure .gitignore 🛡️
To keep your repository clean and avoid conflicts with IDE files, add the following to .gitignore:
.idea/
target/

If .idea/ files are already tracked, remove them from Git:
git rm -r --cached .idea
git add .gitignore
git commit -m "Ignore .idea/ files and build artifacts"

This step ensures a smoother Git experience moving forward! 🚀
Project Structure 🗂️
The project follows the Page Object Model (POM) design pattern for organized and maintainable code. Here’s a breakdown:

src/main/java/pages/: Contains page classes for different Swag Labs pages. 🌐
ProductsPage.java: Manages product-related interactions (e.g., sorting, adding to cart). 🛒
CartPage.java: Handles cart functionalities (e.g., removing items, navigating to checkout). 🛍️
CheckoutPage.java: Placeholder for checkout page (to be expanded). 📦
LoginPage.java: Manages login functionality (referenced but not provided). 🔑


src/main/java/utils/:
DriverManager.java: Configures and manages the ChromeDriver instance with custom settings to disable popups. 🚦
ConfigReader.java: Reads configuration properties (e.g., username, password) for secure login. 🔐
HelperMethods.java: Provides utility methods for Selenium actions (referenced but not provided). 🛠️


src/test/java/tests/:
ProductsTest.java: Includes 11 test cases for the Products page (e.g., image verification, sorting). ✅
CartPageTest.java: Covers 7 test cases for the Cart page (e.g., item removal, navigation). 🛒
iLoginTest.java: Tests login functionality (not provided). 🔐
CheckoutTest.java: Tests checkout functionality (not provided). 📦


pom.xml: Maven configuration file for dependencies and plugins. 📋
testng.xml: TestNG configuration defining suites, classes, and the Allure listener. 🎧

Test Coverage 🧪
The project thoroughly tests various features of the Swag Labs website:
Products Page Tests (ProductsTest.java) 🌟

Verify product images load correctly. 📸
Verify product names are displayed correctly. 🔤
Verify product prices are displayed correctly. 💰
Verify the "Add to Cart" button is functional. 🛒
Verify sorting functionality works (Name A-Z). 🔤
Verify product descriptions are displayed correctly. 📝
Verify page sorting functionality (Price: Low to High). 💸
Verify the page title and header display correctly (via isAt()). 🎯
Verify that the website handles adding multiple products to cart. 🛍️
Verify Remove button appears after adding to cart and decreases cart count. ❌
Verify 'Reset App State' persists after page refresh. 🔄
Verify product details page navigation and content. 📑
Verify shopping cart badge counter updates correctly. 🛒
Verify the item removal functionality from the cart page, validating the complete add-to-cart and remove-from-cart workflow. 🔄
Verify the product description page functionality, ensuring all product details are displayed correctly when viewing an individual item. 📋

Cart Page Tests (CartPageTest.java) 🛒

Verify cart items are displayed correctly. 🛍️
Verify the "Remove" button functionality. ❌
Verify "Continue Shopping" button navigates back to the product page. 🔙
Verify "Checkout" button redirects to the checkout page. ➡️
Verify the cart icon updates correctly when items are removed. 🔄
Verify the cart icon updates correctly after adding items. ✅
Verify the cart count resets after removing all items. 🔢

Running the Tests 🏃‍♂️
Let’s get those tests running! Follow these steps:
1. Run Tests via TestNG 🎚️
Use the testng.xml file to execute all test suites in parallel:
mvn clean test


Runs tests with 3 threads as configured in testng.xml.
Generates Allure results in target/allure-results. 📂Watch the console for live updates as tests execute! ⏩

2. Run Individual Test Class 🎯
To run a specific test class (e.g., ProductsTest):

From IDE: Right-click on ProductsTest.java and select "Run 'ProductsTest'". 🖱️
From Terminal:mvn test -Dtest=ProductsTest



Pick your favorite method and enjoy the results! 😄
3. Generate Allure Report 🌈
After running the tests, generate the Allure report to see the magic:
allure serve target/allure-results


Opens the report in your default browser with detailed insights. 📊
Includes pass/fail status, logs, and more (if configured). 🔍Get ready to explore your test results in style! 🎉

Troubleshooting 🛠️
During the project setup and execution, we faced some hurdles, but we overcame them! Here’s what happened:

Allure Commandline Issues: 😓
Problem: Running allure --version resulted in 'allure' is not recognized as an internal or external command.
Solution: Installed Node.js and npm (node --version, npm --version), then reinstalled Allure with npm install -g allure-commandline@2.29.0 and added C:\Users\<YourUsername>\AppData\Roaming\npm to the PATH. ✅


Problem: Allure reports were empty or not generated.
Solution: Ensured the Allure TestNG listener (io.qameta.allure.testng.AllureTestNg) was in testng.xml and added missing Allure dependencies to pom.xml. 🔧




Git Conflicts: 😤
Problem: git pull failed with "Your local changes will be overwritten by merge" for .idea/ files.
Solution: Added .idea/ to .gitignore, removed tracked files with git rm -r --cached .idea, and committed the changes. 🚀


Problem: "Failed to connect to github.com port 443".
Solution: Checked network connectivity, disabled proxy/VPN, and updated Git to 2.45.1. 🌐




Test Execution Issues: 🤔
Problem: "Tests run: 0" when running mvn clean test.
Solution: Confirmed TestNG classes were correctly referenced in testng.xml and contained @Test methods. ✅


Problem: "Error opening zip file or JAR manifest missing" during debug.
Solution: Moved the project to a path without spaces (e.g., C:\Projects\selenium-automation-final-project) and refreshed Maven with mvn clean install. 🗂️





Recommendations for Improvement 🌱
Let’s make this project even better! Here are some ideas:

Add Allure Dependencies to pom.xml: Include these for seamless report generation: 📋<dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-testng</artifactId>
    <version>2.29.0</version>
</dependency>
<plugin>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-maven</artifactId>
    <version>2.12.0</version>
    <configuration>
        <reportVersion>2.29.0</reportVersion>
        <resultsDirectory>${project.build.directory}/allure-results</resultsDirectory>
    </configuration>
</plugin>


Screenshots on Failure: Add a TestNG listener to capture screenshots on test failure and attach them to Allure reports for better debugging. 📷
Expand Checkout Tests: The CheckoutPage.java is empty—let’s implement test cases for the checkout process to cover the full workflow! 🛒
Centralize Configuration: Ensure ConfigReader.java handles all configurations (e.g., browser type, timeouts) securely. 🔐
Add Error Handling: Enhance HelperMethods.java with robust retry mechanisms for flaky tests. 🔧

Conclusion 🎊
This project is a fantastic demonstration of automation testing for the Swag Labs website using Selenium, TestNG, and Allure! 🌟 Despite initial challenges with Allure report generation and Git conflicts, we tackled them head-on, and now the project supports comprehensive testing of the Products and Cart pages. 🚀 Future enhancements can include expanding test coverage for the checkout process, adding visual debugging, and refining error handling. Keep up the great work, and happy testing! 😄👍

Generated on Tuesday, May 13, 2025, 05:56 PM EEST. 🌅
