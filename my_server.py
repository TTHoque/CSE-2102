import http.server
import socketserver
from http import HTTPStatus

class Handler(http.server.SimpleHTTPRequestHandler):
    def do_GET(self):
        i = 0
        self.send_response(HTTPStatus.OK)
        self.end_headers()
        my_str = "Hello World: " + str(i)
        self.wfile.write(bytes(my_str, 'utf-8'))
        i+=1

if __name__ == "__main__":
    httpd = socketserver.TCPServer(('', 8002), Handler)
    httpd.serve_forever()