node("cd") {
    git url: "https://github.com/smarlhens/${serviceName}.git"
    dockerFlow(serviceName, ["deploy", "proxy", "stop-old"])
}