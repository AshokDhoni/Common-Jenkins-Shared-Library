def call1() {
	echo "Welcome to Jenkins Shared Library"
	echo "Update the library"
}

def displayAnotherMessage(msg) {
  echo "Message received is: ${msg}"
	sh 'ls'

}

def call2(java.lang.String msg) {
	echo "Welcome ${msg}"
}

