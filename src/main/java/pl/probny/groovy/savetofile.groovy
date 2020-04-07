package groovy_proj1

/*println "Hello World!"

file1.write("Line 1")
file1 << "\nLine 2"
println file1.text*/

/*def file1 = new File("file1.txt")
println "wpisz cos: "
def tekst = System.console().readLine()
file1 << tekst
println "tekst = $tekst\n"

println tekst == "test"
println tekst.equalsIgnoreCase("test")*/

def zxc
def dir = new File(getClass().protectionDomain.codeSource.location.path).getParent() + "\\"

def file2 = new File(dir + "file2.txt")
file2.withWriter { writer ->

    while (true) {
        zxc = System.console().readLine()
        if(zxc.equalsIgnoreCase("stop"))
            break;
        writer.writeLine(zxc)
    }
}
println "---------------------------------------"
println file2.getText()