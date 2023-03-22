from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/')
def home():
    return "Hello, World!"

@app.route('/api/v1/uppercase', methods=['POST'])
def uppercase():
    if request.method == 'POST':
        data = request.get_json()
        if 'text' in data:
            text = data['text']
            result = {'result': text.upper()}
            return jsonify(result), 200
        else:
            return jsonify({'error': 'Missing "text" parameter'}), 400
    else:
        return jsonify({'error': 'Invalid request method'}), 405

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=80)
