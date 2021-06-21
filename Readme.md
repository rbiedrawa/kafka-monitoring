# Monitoring tools for Apache Kafka ecosystem (PoC)

The goal of this example project is to demonstrate different approaches to monitor Apache Kafka ecosystem.

## Caution

The examples in this repository are only for testing purposes only.

## Getting Started

This repository contains multiple docker-compose stacks, which includes all necessary monitoring infrastructure.

Each sample demonstrates how to collect and monitor useful metrics and visualize records using various types of tools available online.

Docker compose stacks can be found under [docker](./docker) directory.

### Build and Install

Please refer to the individual readme files for further instructions how to build/install selected monitoring demo.

**Available demos:**

* [Burrow](./docker/burrow)
* [Kafka Lag Exporter](./docker/kafka-lag-exporter)
* [KMinion](./docker/kminion)
* [Confluent Platform Community Edition](./docker/cp-all-in-one-community)
* [Kowl - Apache Kafka Web UI](./docker/kowl)


## Sample Screenshots of available dashboards

### KMinion

<table>
  <tr>
    <td>KMinion Cluster</td>
     <td>kminion-consumer</td>
     <td>kminion-topic-dashboard</td>
  </tr>
  <tr>
    <td><img src="./_docs/img/kminion-cluster-dashboard.png" width="250" /></td>
    <td><img src="/_docs/img/kminion-consumer-group.png" width="250" /> </td>
    <td><img src="/_docs/img/kminion-topic-dashboard.png" width="250" /></td>
  </tr>
 </table>

### Burrow

<table>
  <tr>
    <td>KMinion Cluster</td>
     <td>kminion-consumer</td>
     <td>kminion-topic-dashboard</td>
  </tr>
  <tr>
    <td><img src="./_docs/img/kminion-cluster-dashboard.png" width="250" /></td>
    <td><img src="/_docs/img/kminion-consumer-group.png" width="250" /> </td>
    <td><img src="/_docs/img/kminion-topic-dashboard.png" width="250" /></td>
  </tr>
 </table>


## References

* [Prometheus](https://prometheus.io/)
* [Grafana](https://grafana.com/)

## License

Distributed under the MIT License. See `LICENSE` for more information.