interface HelloWorldProps {
	name: string
}

function HelloWorld({name}: HelloWorldProps) {
	return (<h1>Hello {name}</h1>);
}

export default HelloWorld;