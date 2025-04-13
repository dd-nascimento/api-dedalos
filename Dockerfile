FROM ubuntu:22.04

# Limpar o cache do apt e corrigir dependências antes de instalar
RUN apt-get update && apt-get -y install openjdk-17-jdk 

# Configurar o JAVA_HOME e PATH
ENV JAVA_HOME=/usr/lib/jvm/java-20-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

# Verificar a instalação do Java
RUN java -version
