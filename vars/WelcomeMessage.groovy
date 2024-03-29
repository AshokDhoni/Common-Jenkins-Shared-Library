def call() {
	echo "Welcome to Jenkins Shared Library"
	echo "Update the library"
}

def displayAnotherMessage(msg) {
  echo "Message received is: ${msg}"
	sh 'ls'

}

def test2() {
	echo "test2"

}
