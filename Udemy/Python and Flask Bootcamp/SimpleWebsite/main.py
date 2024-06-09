from flask import Flask

app = Flask(__name__) # This is the main or first file to go to

@app.route('/')
def index():
    return '<h1>Hello Puppy</h1>'

if __name__ == "__main__":
    app.run()