let temperature = process.argv[2];

if(temperature <= 20.0) {
    console.log("<= temp: " + temperature);
} else if(temperature >= 21.0) {
    console.log(">= temp: " + temperature);
} else {
    console.log("temp ok");
}