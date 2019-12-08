# kafka-hello-world

<h3>Steps to start under Arch-linux </h3>
1. I'm tuning kafka with help of official documentation for startng and kafka and zookeper(1 and 2 step) <br>
            
       https://kafka.apache.org/quickstart

<div>2. I was starting SpringBootHelloWorldApplication class as Java Application;
            </br>
</div>
3. I was executing next command for be recepient:

       bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic java_in_use_topic --from-beginning
</br>
4. I was going to next url and was watching message on recepient console

       http://localhost:8080//javainuse-kafka/producer?message=test
