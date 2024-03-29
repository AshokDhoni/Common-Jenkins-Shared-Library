def call() {
	echo "Welcome to Jenkins Shared Library"
	echo "Update the library"
}

def displayAnotherMessage(String msg) {
  echo "Message received is: ${msg}"

}

def test2() {
	echo "test2"

}
