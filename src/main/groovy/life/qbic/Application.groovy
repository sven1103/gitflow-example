package life.qbic

class Application {
  static void main(String[] args) {
    println "Hello QBiC"
    println "The current date is ${new Date().format( 'yyyy-MM-dd' )}"
  }
}