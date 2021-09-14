1: Pull docker postgres image - "docker pull coder990/postgresql:latest"
</br>
2: Hit comand for running container - "docker run --name postgresdb -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d coder990/postgresql"
</br>
3: Make sure docker container is running - "docker ps"
</br>
4: open DBeaver and connect docker postgres ,
</br>
                                            1: pick icon - create new connection 
                                            </br>
                                            2: pick postgresql , go next
                                            </br>
                                            3: enter username and password, in this case both is "postgres"
                                            </br>
                                            4: make sure that port is 5432
                                            </br>
                                            5: hit "Test Connection" and klick finish
                                            </br>
                                            for troubles here is video that will be guide you : https://www.youtube.com/watch?v=RdPYA-wDhTA
</br>
5: Pull java project "orderapp"
</br>
6: Create connection of db in intelliJ
</br>
7: Fill the data exact same as in DBeaver, make sure that you entered same database name as in Dbeaver connections
</br>
8: Click "Test Connection" and klick apply, ok.
</br>
9: If you changed database name diffrent then is in file "application.properties = postgres" make sure to rename it same as your db name.
</br>
10: Run the app and test it in postman
