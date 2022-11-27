1)  4 репликации:
deploy:
    mode: replicated
    replicas: 4
    restart_policy:
        condition: any
        delay: 10s
        max_attempts: 5
        window: 120s

2) далее инициализировать docker swarm через команду docker swarm init
3) установить docker registry через команду 'docker service create --name registry --publish published=5000,target=5000 registry:2'
4) можно проверить статус 'docker service ls'
5) и проверить соединение  'curl http://localhost:8080/'
