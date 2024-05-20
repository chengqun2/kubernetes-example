### docker 部分
docker build -t example:1.0.1 .

### kubernetes 部分
kubectl apply -f deploy.yml
kubectl get pods
kubectl logs example-6477c68b54-f6kg9
kubectl apply -f service.yml
kubectl get deployments,services,pods
kubectl delete -n default pod/example-6477c68b54-ckl4z
kubectl delete -n default deployment.apps/example


浏览器打开： http://localhost:30008/demo/getIp
