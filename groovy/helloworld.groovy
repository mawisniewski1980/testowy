package groovy

def text = "world"
def dir = new File(getClass().protectionDomain.codeSource.location.path).getParent().toString()
println "Hello $text !!!"
println dir
