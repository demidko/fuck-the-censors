import {obfuscate} from "./modules/replacer";

async function onPaste(obj) {
  let text = obfuscate(obj.value)
  console.warn(text)
}