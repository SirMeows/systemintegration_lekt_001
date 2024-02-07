import json
import xml.etree.ElementTree as ET
import yaml

class DataParser:
    def parse_xml(self, file_path):
        # Assuming XML structure is simple and directly maps to the Person class
        tree = ET.parse(file_path)
        root = tree.getroot()

        # Constructing Person manually from XML elements
        person = Person(name=root.find('Name').text, hobbies=[hobby.text for hobby in root.find('Hobbies')])
        print("Person object from XML:", person)

    def parse_json(self, file_path):
        with open(file_path, 'r') as file:
            person_dict = json.load(file)
            person = Person(**person_dict)
            print("Person object from JSON:", person)

    def parse_yaml(self, file_path):
        with open(file_path, 'r') as file:
            person_dict = yaml.safe_load(file)
            person = Person(**person_dict)
            print("Person object from YAML:", person)

if __name__ == "__main__":
    data_parser = DataParser()
    try:
        data_parser.parse_xml("src/main/resources/me.xml")
        data_parser.parse_json("src/main/resources/me.json")
        data_parser.parse_yaml("src/main/resources/me.yaml")
    except Exception as e:
        print(e)
