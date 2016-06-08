@startuml

interface GumballMachineRemote
GumballMachineRemote .up.|> java.rmi.Remote
class GumballMachine .up.|> GumballMachineRemote
GumballMachine -up-|> java.rmi.UnicastRemoteObject

interface State {
    +insertQuarter():void
    +ejectQuarter():void
    +turnCrank():void
    +dispense():void
}

State <|.. HasQuarter
State <|.. NoQuarter
State <|.. SoldOut
State <|.. Sold
java.io.Serializable <|-- State

GumballMonitor -up-> GumballMachine

@enduml