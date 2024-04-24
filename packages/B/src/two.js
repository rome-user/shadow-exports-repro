// Removing the file extension will fix the shadow compilation error.
import { foo } from "A/foo.js";

const baz = foo * 3;

export { baz };
