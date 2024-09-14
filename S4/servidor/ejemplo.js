// Módulos
const http = require('http');
const fs = require('fs');
const path = require('path');

// Datos
const productos = [
  { id: 1, nombre: 'Producto 1', precio: 100 },
  { id: 2, nombre: 'Producto 2', precio: 200 },
  { id: 3, nombre: 'Producto 3', precio: 300 },
];

// Crear el servidor
const server = http.createServer((req, res) => {
  // METODO GET
  if (req.method === 'GET') {
    // Ruta No. 1 --> /
    if (req.url === '/') {
      // leer el archivo index.html
      const filePath = path.join(__dirname, 'index.html');
      return fs.readFile(filePath, (err, content) => {
        // Si existe error
        if (err) {
          res.writeHead(500, { 'Content-Type': 'text/plain' });
          res.end('Error al cargar la página');
        } else {
          // Mostrar el archivo HTML
          res.writeHead(200, { 'Content-Type': 'text/html' });
          res.end(content);
        }
      });
    }

    // Ruta No. 2 --> /acerca
    if (req.url === '/acerca') {
      res.writeHead(200, { 'Content-Type': 'text/html' });
      return res.end(
        `<div>
            <h1>Pagina acerca de</h1>
            <a href="/">Regresar a Inicio</a>
          </div>`
      );
    }

    // Ruta No. 3 --> /productos
    if (req.url === '/productos') {
      res.writeHead(200, { 'Content-Type': 'application/json' });
      return res.end(JSON.stringify(productos));
    }

    // Ruta No. 4 --> /productos-renderizados
    if (req.url === '/productos-renderizados') {
      res.writeHead(200, { 'Content-Type': 'text/html' });
      let contenido = '<h1>Productos</h1>';
      contenido += '<ul>';
      productos.forEach((producto) => {
        contenido += `<li>${producto.id} <--> ${producto.nombre} <--> ${producto.precio}</li>`;
      });
      contenido += '</ul>';
      return res.end(contenido);
    }

    // Respuesta para cualquier otra ruta
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Pagina no encontrada');
  }
});

// Ejecutar el servidor
server.listen(3000, () => {
  console.log('Servidor escuchando en la ruta: http://localhost:3000');
});
