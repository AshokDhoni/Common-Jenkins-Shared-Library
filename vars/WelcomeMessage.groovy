def info(message) {
    node {
    echo "INFO: ${message}"
    }
}

def warning(message) {
    node {
    echo "WARNING: ${message}"
    }
}


def call(msg1, msg2)
{
    echo "${msg1} & ${msg2}"
   mul();
}

def call(msg1, msg2, number)
{
    echo "${msg1} & ${msg2}"
   mul();
}

def mul() {
    echo "from mul()"
}

def add(x,y){
	echo "The sum of ${x} and ${y} is ${x+y}"
}

def mul(x,y){
	echo "The Mul of ${x} and ${y} is ${x*y}"
}

def call(){
	echo "Welcome to Calculator"
}
