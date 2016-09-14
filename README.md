# archetype-parent
通用企业maven骨架结构

1.清除ide配置文件
idea
mvn idea:clean
eclipse
mvn eclipse:clean

2.创建骨架
mvn archetype:create-from-project

3.加入构建配置
<distributionManagement>
		<repository>
			<id>dev-release</id>
			<name>Nexus Releases Repository</name>
			<url>http://ip:port/nexus/content/repositories/releases/</url>
		</repository>
		<snapshotRepository>
			<id>dev-snapshot</id>
			<name>Nexus Snapshots Repository</name>
			<url>http://ip:port/nexus/content/repositories/snapshots/</url>
		</snapshotRepository>

	</distributionManagement>

4.部署到nexus
mvn deploy