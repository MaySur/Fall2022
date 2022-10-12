from http.server import BaseHTTPRequestHandler, HTTPServer
#import mimetypes
from os import curdir, sep

class myHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        mimetype = 'text/html'
        if self.path == '/':
            self.path ='index.html'
            sendReply = False
        elif self.path == 'htm':
            mimetype = 'text/html'
            sendReply = True
            self.path.replace('htm','html')
        elif self.path.endswith('.html'):
                mimetype = 'text/html'
                sendReply = True
        elif self.path.endswith('.jpg'):
                mimetype= 'image/jpeg'
                sendReply = True
        elif self.path.endswith('.jpeg'):
                mimetype= 'image/jpeg'
                sendReply = True
        elif self.path.endswith('.gif'):
                mimetype='image/gif'
                sendReply = True
        elif self.path.endswith('.js'):
                mimetype='application/javascript'
                sendReply = True           

        elif '.' not in self.path:
                self.path +='.html'

        self.reply(mimetype)
                



    def reply(self, mimetype):
        try:
            f = open(curdir + sep + self.path, 'rb')
            self.send_response(200)
            self.send_header('Content-type', mimetype)
            self.end_headers()
            self.wfile.write(f.read())
            f.close()
        except IOError:
            print('File Not Found'+self.path)
            return False
        return True
def main():
    PORT_NUMBER = 8080
    try:
        server = HTTPServer(('', PORT_NUMBER), myHandler)
        print ('Started httpserver on port ' , PORT_NUMBER)
        server.serve_forever()
    except KeyboardInterrupt:
        print ('^C received, shutting down the web server')
        server.socket.close()

if __name__ == '__main__':
    main()