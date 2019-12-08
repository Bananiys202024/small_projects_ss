# jdbc-tutorial
It's good guide of jdbc.<br>
JDBC will always give better performance as compared to Hibernate for most of the database vendors.<br>

<h2>Frameworks and tools</h2>

<h6>
    Java&IDE: JDK7 MyEclipse2018<br>
    Database: Postgresql<br>
    Build Tool: Maven<br>
    Drivers: JDBC<br>
</h6>

<h2>Troubleshooting</h2>
  <div>If you get next error "The superclass "javax.servlet.http.HttpServlet" was not found on the Java Build Path" then you should add library "javax.servlet-api" to your project.
  </div>

<h2>Postgresql on arch-linux</h2>
<ul>
<ol>To swtich to postgresql user</ol>
     
            sudo -iu postgres
<ol>Create database "jdbc-tutorial"</ol>

            createdb jdbc-tutorial

<ol>Enter to postgresql to database "jdbc-tutorial"</ol>
  
            psql -d jdbc-tutorial            

<ol>List all users and their permission levels:</ol>
  
            \du
</ul>

<h3>Maven</h3>
1. maven ищет код для сборки в директории <project>src/main/java.
<br>
2. Инструкции по сборке maven будет искать в <project>/pom.xml
<br>
3. Результат работы системы сборки называется артефактом.
<br>
4. От программиста требуется задать groupId, artifactId и version
<br>
5. Сборка осуществляется командой mvn compile
<br>
6. Скомпилированный java код выглядит так же, как исходный код, но вместо файлов с расширением java, там будут файлы с расширением class.
<br>
7.Запустить скомпилированную программу можно командой
  
         mvn exec:java -Dexec.mainClass="tutorial.jdbc_guide.Main"
 <br>

<h2>Time performance</h3>
JDBC will always give better performance as compared to Hibernate for most of the database vendors. You can check the comparison made as given in the link below. He concludes that hibernate is fast when quering tables with less rows else jdbc is way better.
http://phpdao.com/hibernate_vs_jdbc/

<h3>What is Postgresql?</h3>

PostgreSQL, also known as Postgres, is a free and open-source relational database management system (RDBMS) emphasizing extensibility and technical standards compliance. It is designed to handle a range of workloads, from single machines to data warehouses or Web services with many concurrent users. It is the default database for macOS Server,[11][12][13] and is also available for Linux, FreeBSD, OpenBSD, and Windows.

PostgreSQL features transactions with Atomicity, Consistency, Isolation, Durability (ACID) properties, automatically updatable views, materialized views, triggers, foreign keys, and stored procedures.[14] PostgreSQL is developed by the PostgreSQL Global Development Group, a diverse group of many companies and individual contributors.[15]

<h3>What is JDBC</h3>

Java Database Connectivity (JDBC) is an application programming interface (API) for the programming language Java, which defines how a client may access a database. It is a Java-based data access technology used for Java database connectivity. It is part of the Java Standard Edition platform, from Oracle Corporation. It provides methods to query and update data in a database, and is oriented towards relational databases. A JDBC-to-ODBC bridge enables connections to any ODBC-accessible data source in the Java virtual machine (JVM) host environment.





<h2>Good guide about jdbc from mkyong</h2>
https://github.com/mkyong/java-jdbc/tree/master/postgresql/src/main/java/com/mkyong/jdbc

