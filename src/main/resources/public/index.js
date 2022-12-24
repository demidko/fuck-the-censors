async function obfuscate(obj) {
  let response = await fetch("obfuscate", {
    method: "POST",
    body: obj.value
  })
  let text = await response.text()
  console.warn(text)
}