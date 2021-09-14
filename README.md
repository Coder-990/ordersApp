1: Pull docker postgres image - "docker pull coder990/postgresql:latest"
2: Hit comand for running container - "docker run --name postgresdb -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d coder990/postgresql"
3: Make sure docker container is running - "docker ps"
4: open DBeaver and connect docker postgres ,
                                            1: pick icon - create new connection 
                                            2: pick postgresql , go next
                                            3: enter username and password, in this case both is "postgres"
                                            4: make sure that post is 5432
                                            5: hit "Test Connection" and klick finish
                                            for troubles here is video that vill guide you : https://www.youtube.com/watch?v=RdPYA-wDhTA
5: Pull java project "orderapp"
6: Create connection of db in intelliJ
7: Fill the data exact same as in DBeaver, make sure that you entered same database name as in Dbeaver connections
8: Click "Test Connection" and klick apply, ok.
9: If you changed database name diffrent then is in file "application.properties = postgres" make sure to rename it same as your db name.
10: Run the app and test it in postman