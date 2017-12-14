artifactory('8081') {
  localRepository('i1') {
  }
  repository('i1') {
    starPull '8084'
  }
}