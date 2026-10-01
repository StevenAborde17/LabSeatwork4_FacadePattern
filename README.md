# Simplified Intelligent Home System
- The HomeApp needs to manage various home services for an intelligent home system. These services include turning on and off the lights, TV, and air conditioning. However, the HomeApp aims to interact with these services through a simplified, single interface provided by the HomeInterface. The HomeInterface class should delegate the user’s requests to the appropriate service classes (Light, TV, AirConditioning) while abstracting the service details from the user. Additionally, the HomeInterface should provide methods to turn on all services (turnOnAll()) and turn off all services (turnOffAll()).

# Class Definitions:
- <b>HomeService (Interface):</b> Defines the common interface for all home services.
- <b>Light:</b> A service class implementing the HomeService interface, responsible for turning the lights on and off. It includes the turnOn() and turnOff() methods.
- <b>TV:</b> A service class implementing the HomeService interface, responsible for turning the TV on and off. It includes the turnOn() and turnOff() methods.
- <b>AirConditioning:</b> A service class implementing the HomeService interface, responsible for turning the air conditioning on and off. It includes the turnOn() and turnOff() methods.
- <b>HomeInterface:</b> The facade class that coordinates interactions between the client (HomeApp) and the individual home services. It includes the turnOnAll() and turnOffAll() methods to control all services simultaneously.
- <b>HomeApp:</b> The client class that uses the HomeInterface to access and utilize home services seamlessly.
