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
    echo "${msg1} & ${msg2} & ${number}"
   mul();
}

def mul() {
    echo "from mul()"
}

