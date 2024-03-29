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
