import json

json_text = {"messages":[{"message":"This is the first message","timestamp":"2021-06-04 16:40:53"},{"message":"And this is a second message","timestamp":"2021-06-04 16:41:01"}]}
"""
a = json.dumps(json_text, indent=2)

object = json.loads(json_text)
print(type(object))
"""
print(type(json_text))
a=[]
a = (json_text["messages"][1]["message"])
print(a)
