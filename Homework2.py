import  requests

response = requests.get("https://playground.learnqa.ru/api/long_redirect")
a = response.history
print(a[-1].url)
