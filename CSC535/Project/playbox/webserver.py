from http.server import HTTPServer, BaseHTTPRequestHandler
tasklist =['Task1','Task2','Task3']

class requestHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        if self.path.endswith('.html'):
            self.send_response(200)
            self.send_header('content-type', 'text/html')
            self.end_headers()

            output =''
            output += '<html><body>'
            output+= '<h1>Task List</h1>'
            output += '<h3><a href= ".html/new">Add New Task</a></h3> '
            for task in tasklist:
                output +=task
                output += '</br>'
            output += '<img src="flower1.jpg" width="100", height="200", alt="flower 1">'
            output += '</body></html>'
            self.wfile.write(output.encode())

def main():
    PORT = 8080
    server = HTTPServer(('', PORT),requestHandler)#helloHandler echoHandler
    print('Server running on port %s'% PORT)
    server.serve_forever()

if __name__ == '__main__':
    main()
    
'''
#WEBSERVER
class helloHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header('content-type', 'text/html')
        self.end_headers()
        self.wfile.write('Hello Mayur!'.encode())
#ECHO(type in the adress and it prints)
class echoHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header('content-type', 'text/html')
        self.end_headers()
        self.wfile.write(self.path[1:].encode())
'''