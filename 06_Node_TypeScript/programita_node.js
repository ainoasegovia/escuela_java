console.log("Hola que tal?");

var directorio = process.cwd();

console.log("Directorio: " + directorio);
console.log("Dso CPU: " + process.cpuUsage());
console.log("Dso User: " + process.cpuUsage().user);

document.getElementById("No-Es-Navegador");