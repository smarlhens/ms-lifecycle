node("cd") {
    git url: "https://github.com/smarlhens/${serviceName}.git"
    dockerFlow(serviceName, ["scale", "proxy"], ["--scale=\"" + scale + "\""])
}